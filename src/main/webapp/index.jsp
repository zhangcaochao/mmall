<%@ page language="java"  contentType="text/html; charset=UTF-8" %>

<html>
<body>
<h2>Hello World!</h2>

<form action="/manage/user/login.do" method="post" enctype="application/x-www-form-urlencoded">
    <label>
        用户名
        <input type="text" name="username">
    </label>
    <label>
        密码
        <input type="password" name="password">
    </label>
    <button type="submit">
        提交
    </button>
</form>



springmvc上传文件
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="springmvc上传文件" />
</form>


富文本图片上传文件
<form name="form2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="富文本图片上传文件" />
</form>

</body>
</html>
