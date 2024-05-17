<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页</title>
    <style>
        .header{
            display: flex;
            justify-content: flex-end;
        }
        .main{
           width: 700px;
           margin:200px auto;
        }
        .main table{
           width: 100%;
           text-align: center;
            
        }
        .main .search{
          
        }
        .main .search input.username{
           height: 30px;
           line-height: 30px;
           width: 250px;
        }
        .main .search input.btn{
           height: 35px;
           line-height: 35px;
           width: 90px;
           
        }

        .main .add{
            margin-top:20px;
            margin-bottom: 5px; 
        }
        .main .add input{
        height: 35px;
           line-height: 35px;
           width: 90px;
        }

    </style>
</head>
<body>
    <div class="header">
        欢迎，${user.username} &nbsp;&nbsp;
        <form action="/api/logout" method="post" >
            <input type="submit" value="退出">
        </form>
    </div>
    <div class="main">
        <form action="/api/student/getByName" method="get" class="search" >
            <input type="text" name="name" placeholder="请输入姓名" class="username">
            <input type="submit" value="查询" class="btn">
        </form>
        <form action="/api/student/addPage" method="get" class="add">
            <input type="submit" value="新增">
        </form>
        <table border="1" cellspacing="0" cellpadding="10">
            <tr>
                <th>序号</th>
                <th>用户名</th>
                <th>邮箱</th>
                <th>年龄</th>
                <td>操作</td>
            </tr>
            <#list students as student>
                <tr>
                    <td>${student_index+1}</td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>${student.age}</td>
                    <td>
                        <form action="/api/student/editPage" method="post" style="display: inline-block;">
                            <input type="hidden" name="id" value="${student.id}">
                            <input type="submit" value="编辑" />
                        </form>&nbsp;&nbsp;
                        <form action="/api/student/delete" method="post" style="display: inline-block;">
                            <input type="hidden" name="id" value="${student.id}">
                            <input type="submit" value="删除" />
                        </form>
                    </td>
                </tr>
            </#list>


           
        </table>
    </div>

    

    
</body>
</html>