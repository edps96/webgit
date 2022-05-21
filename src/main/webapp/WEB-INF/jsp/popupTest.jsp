<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>aa</title>
	<script src="<c:url value='/js/jquery.js'/>"></script>
	<script src="<c:url value='/js/jqueryui.js'/>"></script>
	<script src="<c:url value='/js/jquery.form.js'/>"></script>	
<script type="text/javaScript" language="javascript" defer="defer">

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
	payForm.attr('action', data.reqPayUrl);
	payForm.attr('target', "payPopup");
	payForm.attr('accept-charset', "euc-kr");
	
							payForm.submit();

	payForm = "";
};

</script>
</head>
<body>
<a href="javascript:fn_popup();">클릭</a>
</body>
</html>