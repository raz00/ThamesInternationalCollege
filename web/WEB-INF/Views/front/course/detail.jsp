
<%@include file ="../header.jsp" %>
<h1> Courses Detail :${course.name}<h1>
<p> $(course.description)</p>
<div>
    <h2> Fees: ${course.fees}</h2>
 </div>
<div>
    <h2> Duration: ${course.duration} ${course.durationType}(s)</h2>
 </div>
    <a href="${SITE_URL}/enroll/?cid=${course.id}"> Enroll Now </a>
<%@include file ="../footer.jsp" %>