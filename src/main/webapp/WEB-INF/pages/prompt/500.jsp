<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>505-error</title>
 <link rel="stylesheet"  href="${ctx}/css/prompt/prompt.css" />
</head>
<body>
	<div class="container" >
	     <div class="errorContent2">
		    <h1 class="red">500错误！</h1>
            <h1 class="gray">报歉，系统发生错误无法显示此页面！</h1>
            <p>因为系统发生错误无法显示该页面！您可以返回上一页，或者返回首页，重新浏览页面！</p>
         </div>
	</div>
</body>
</html>
