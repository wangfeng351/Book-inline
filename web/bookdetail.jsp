<%--
  Created by IntelliJ IDEA.
  User: wfzs
  Date: 2019/10/4
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书详情</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        .top{
            display: flex;
            justify-content: space-between;
            background-color: rgb(78,42,64);
            width: 100%;
            height: 60px;
            align-items: center;
        }
        .top ul{
            display: flex;
            list-style: none;
            padding-left: 30px;
            padding-right: 10px;
        }
        .top ul li{
            margin-right: 20px;
            flex: 0 0 60px;
        }
        .top ul li a{
            text-decoration: none;
            color: white;
        }
        .search-wrap{
            display: flex;
            width: 100%;
            height: 80px;
            padding-left: 5%;
            background-color: rgb(163,92,143);
            /*文本垂直居中*/
            line-height: 80px;
            justify-content: space-between;
        }
        .container{
            width: 80%;
            height: 100%;
            display: flex;
            margin-left: 10%;
            margin-right: 10%;
        }
        .right{
            flex: 0 0 30%;
            padding: 5px 5px 5px 5px;
            border: 1px solid #aaaaaa;
        }
        .left{
            flex: 0 0 70%;
            padding-top: 10px;
            border: 1px solid #aaaaaa;
        }
    </style>
</head>
<body>
<div class="top">
    <jsp:include page="header.jsp"/>
</div>
<div class="search-wrap">

</div>
<div class="container">
    <div class="left">
        <div>
1
        </div>
    </div>
    <div class="right">

    </div>
</div>
</body>
</html>
