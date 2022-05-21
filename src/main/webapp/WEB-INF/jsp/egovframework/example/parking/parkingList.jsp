<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!-- jQuery -->
	<link rel="stylesheet" href="<c:url value='/css/jqueryui.css'/>"/>
	<script src="<c:url value='/js/jquery.js'/>"></script>
	<script src="<c:url value='/js/jqueryui.js'/>"></script>
	<script src="<c:url value='/js/jquery.form.js'/>"></script>	
<script type="text/javascript">

	
function fn_editSerialize() {

	if  ( confirm("저장 하시겠습니까?") )  {
			
		var formData = $("#my").serialize();

		alert(formData);
		$.ajax({
			url : "<c:url value='/serializeAjax.do'/>",
			type: "POST",  
			data: formData,
			dataType : "JSON",
			success : function(data) {
				if  ( data.result )  {
					alert(data.message);
                }  else  {
                    alert(data.message);
                }
			}
		});
	}
}
	

function fn_editArray() {

	if  ( confirm("저장 하시겠습니까?") )  {
			
		var checkArry = [];
		
	    $("input[name='buildingForm']:checked").each(function(i) {
	    	checkArry.push($(this).val());
	    });			
			
		$.ajax({
			url : "<c:url value='/arrayAjax.do'/>",
			type: "POST",  
			data: {valueArrTest: checkArry},
			dataType : "JSON",
			success : function(data) {
				if  ( data.result )  {
					alert(data.message);
                }  else  {
                    alert(data.message);
                }
			}
		});
	
	}
}

function fn_editajaxSubmint() {

	if  ( confirm("저장 하시겠습니까?") )  {
			
		$("#my").ajaxSubmit({
			url : "<c:url value='/AjaxSubmit.do'/>",
			//type: "POST",
			success : function(data) {
				if  ( data.result )  {
					alert(data.message);
                }  else  {
                    alert(data.message);
                }
			}
		});	
				
	}
}
	
	
function fn_popup() {
	var payForm = $('<form></form>');

	payForm.attr("name", "payForm");
	payForm.attr("method", "post");
	
	
	var options = "width=500, height=550, top=100, left=100, fullscreen=no, menubar=no, status=no, toolbar=no, titlebar=yes, location=no, scrollbar=no";
	var html = "";


	html += "<input type='hidden' id='EP_mall_id' name='EP_mall_id' value='1' />";
	html += "<input type='hidden' id='EP_mall_nm' name='EP_mall_nm' value='2' />";
	html += "<input type='hidden' id='EP_order_no' name='EP_order_no' value='3' />";
	html += "<input type='hidden' id='EP_product_nm' name='EP_product_nm' value='4' />";
	html += "<input type='hidden' id='EP_product_amt' name='EP_product_amt' value='5' />";
	html += "<input type='hidden' id='EP_return_url' name='EP_return_url' value='6' />";
	html += "<input type='hidden' id='EP_pay_type' name='EP_pay_type' value='7' />";
	html += "<input type='hidden' id='EP_currency' name='EP_currency' value='8' />";


	payForm.append(html);

	window.open('', "payPopup", options);
	payForm.attr('action', "http://localhost:8080");
	payForm.attr('target', "payPopup");
	payForm.attr('accept-charset', "euc-kr");
	
	payForm.submit();

	payForm = "";
};
</script>
</head>
<body>
<form id ="my"   enctype="multipart/form-data">
	<ul class="checkbox">
	
		<li><input type="checkbox" name="testCheck" value="music" />음악</li>
	
		<li><input type="checkbox" name="testCheck" value="yoga" />요가</li>
	
		<li><input type="checkbox" name="testCheck" value="reading" />독서</li>
	
	</ul>
	
	
<table>
	<tr>
		<th scope="row"><span class="spanLabel required">건물형태</span></th>
		<td>
			<c:forEach items="${buildingForm}" var="buildingForm" varStatus="idx">
				<input type="checkbox" name="buildingForm" id="buildingForm${idx.index}" value="${buildingForm.code }" title="${buildingForm.codeNm }"
				<c:forEach items="${fn:split(data.buildingForm, ',') }" var="item">
					<c:if test="${buildingForm.code eq item}" >
						checked="checked"
					</c:if>
				</c:forEach> />
				<label for="buildingForm${idx.index}" title="${buildingForm.codeNm }"><c:out value="${buildingForm.codeNm }"/></label>
				<span style="padding-right: 30px;"></span>
			</c:forEach>
		</td>
	</tr>
</table>
</form>
<input type="button" class="button buttonB bBlue" onclick="fn_editSerialize();" value="시리얼저장"/>

<input type="button" class="button buttonB bBlue" onclick="fn_editArray();" value="배열저장"/>

<input type="button" class="button buttonB bBlue" onclick="fn_editajaxSubmint();" value="ajaxSubmint"/>



<a href="javascript:fn_popup();">클릭</a>
</body>
</html>