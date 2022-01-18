<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC Demo</title>
    <spring:url value="/resources/index.js" var="mainJs" />
    <script src="${mainJs}"></script>
</head>
<body>
    <h2>${message}</h2>
</body>
</html>