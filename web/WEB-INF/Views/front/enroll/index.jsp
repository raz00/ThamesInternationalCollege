

<%@include file="../header.jsp" %>
<h1>Enroll</h1>

<form action="${SITE_URL}/enroll" method="post">  
    <div>
        <label>First Name</label>
        <input type="text" name="first_name" required="required" placeholder="Enter First Name" />
    </div>
    <div>
        <label>Last Name</label>
        <input type="text" name="last_name" required="required" placeholder="Enter LastName"/>
    </div>
    <div>
        <label>Email</label>
        <input type="email" name="email" required="required" placeholder="Enter Email"/>
    </div>
    <div>
        <label>Contact No</label>
        <input type="text" name="contact_no" required="required" placeholder="Enter COntact NO."/>
    </div>
    <div>
        <label>Course</label>
        <select name="course">
            <option value="">Select Course</option>
            <c:forEach var="course" items="${requestScope.courses}">
                <option value="${course.id}">${course.name}</option>
            </c:forEach>            
        </select>
    </div>
    <div>
        <label>Message:</label>
        <textarea name="message"></textarea>
    </div>  
    <button type="submit">Enroll</button>
</form>
    
<%@include file="../footer.jsp" %>