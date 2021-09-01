<%@ page contentType="text/html;utf-8" pageEncoding="UTF-8" %>
<html>
<head>
    <style>
        #main{
            width: 1000px;
            height: auto;
            border:1px solid black;
            margin:200px auto;
            text-align: center;
            font-size: 20px;
            background: linear-gradient(45deg, rgb(117, 40, 248) 0%, rgb(135, 92, 207) 29%, rgb(188, 53, 169) 65%, #25e8ee 100%);
            border-radius: 20px;
        }
        input{
            width: 200px;
            height: 30px;
            margin-top: 20px;
        }
        body{
            background-image: linear-gradient(-90deg,#72d6a9,#6e6fd4);
        }

        button{
            width: 100px;
            height: auto;
            margin-top: 20px;
        }
        #left{
            width: 498px;
            height:40px;
            border:1px solid dodgerblue;
            background-color: dodgerblue;
            float: left;
        }
        #right{
            float: right;
            width: 498px;
            height:40px;
            border:1px solid green;
            background-color: green;
        }
        #left:hover,#right:hover{
            transform: scale(1.1);
        }
    </style>
</head>
<body>
<h2></h2>
<form class="layui-form" method="get" action="login">

    <div id="main">
        <div>
            <a href="deng"><div id="left">登录</div></a>
            <a href="zhu"><div id="right">注册</div></a>
        </div>
        <div class="layui-form-item" id="name" style="float: none;">
            <h2>${result}</h2>
            <div class="layui-input-block">
                请输入用户名：<input type="text" name="userName" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-inline">
                请输入密码  ：&nbsp; <input type="text" name="userPass" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <label class="layui-form-label">是否记住密码:</label>
                <input type="checkbox" name="switch" lay-skin="switch">

            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="button" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
