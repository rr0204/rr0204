<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<link rel="stylesheet", href="style2.css">

<form action="/applyjob" method="post">
    <h3 style="font-family: 'Calibri Light'"> Fill The Required Details </h3>
    <input type="hidden" name="jobId" value="${jobPost.postId}" />
    <div class="mb-3">
        <label for="fullName" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="fullName" name="fullName" required>
    </div>
    <div class="mb-3">
        <label for="contact" class="form-label">Contact Number</label>
        <input type="text" class="form-control" id="contact" name="contact" required>
    </div>
    <div class="mb-3">
        <label for="email" class="form-label">Email Address</label>
        <input type="email" class="form-control" id="email" name="email" required>
    </div>
    <div class="mb-3">
        <label for="exp" class="form-label">Work Experience</label>
        <input type="number" class="form-control" id="exp" name="exp" required>
    </div>
    <div class="mb-3">
        <label for="resume" class="form-label">Upload resume</label>
        <input type="file" class="form-control" id="resume" name="resume" required>
    </div>
    <button type="submit" class="btn btn-primary">Apply</button>
</form>