<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>编辑学生</title>
    <style>
        .main{
            width: 300px;
            margin:200px auto;
        }
        .main input[type='text']{
          height: 30px;
          line-height: 30px;
          width: 250px;
          margin-bottom: 10px;
        }
        .main input[type='submit'], .main input[type='reset']{
            height: 35px;
          line-height: 35px;
          width: 90px;
          margin-top:10px;
        }
    </style>
</head>
<body>
    <div class="main">
        <div style="font-size:25px;font-weight:bold;text-align:center;margin-bottom:20px;">编辑学生</div>
        <form action="/api/student/edit" method="post">
            <input type="hidden" name="id" value="${student.id}"/>
            <label style="margin-right:10px;">姓名</label><input type="text" name="name" value="${student.name}" placeholder="请输入姓名"/><br/>
            <label style="margin-right:10px;">邮箱</label><input type="text" name="email"  value="${student.email}" placeholder="请输入邮箱"/><br/>
            <label style="margin-right:10px;">年龄</label><input type="text" name="age"  value="${student.age}" placeholder="请输入年龄"/><br/>
            <input type="submit" value="提交"/>&nbsp;&nbsp;
            <input type="reset" value="重置"/>
        </form>
    </div>
    
</body>
</html>