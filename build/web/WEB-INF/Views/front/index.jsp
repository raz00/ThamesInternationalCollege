<%@include file ="header.jsp" %>
<h1> Courses Offered at Thames International College</h1>
<ul>
    <c:forEach var="course" items="${requestScope.courses}">
        <li> <a href="${SITE_URL}/course/detail/?id=${course.id}">${course.name} </a> 
        </li>
    </c:forEach>
</ul>
<%@include file ="footer.jsp" %>