<%@ page import="entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="service.BookService" %><%--
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
        @font-face {
            font-family: 'iconfont';  /* project id 1432359 */
            src: url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.eot');
            src: url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.eot?#iefix') format('embedded-opentype'),
            url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.woff2') format('woff2'),
            url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.woff') format('woff'),
            url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.ttf') format('truetype'),
            url('//at.alicdn.com/t/font_1432359_3d1uq5siuiz.svg#iconfont') format('svg');
        }
        .iconfont{
            font-family:"iconfont" !important;
            font-size:20px;font-style:normal;
            -webkit-font-smoothing: antialiased;
            -webkit-text-stroke-width: 0.2px;
            -moz-osx-font-smoothing: grayscale;}
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
        .header{
            width: 80%;
            height: 120px;
            margin-left: 10%;
            margin-right: 10%;
            margin-bottom: 30px;
        }
        .card {
            height: 120px;
            width: 100px;
        }
        .card img {
            width: 100%;
            height: 100%;
        }
        .bq{
            font-family: 楷体;
            padding-left: 30px;
            margin-top:30px;
            width: 180px;
            line-height: 30px;
            border-top-right-radius:90px;
            height: 30px;
            background-color: #f9f1db
        }
        .dl{
            font-family: 楷体;
            width: 80%;
            margin-left: 10%;
            margin-right: 10%;
            font-size:16px;
            margin-top:20px;
            letter-spacing: 3px
        }
        .search-text{
            width: 160px;
            height: 25px;
            align-items: center;
        }
        .btn{
            border: none;
            width: 20px;
            height: 20px;
            background:transparent;
        }
        .column{
            flex: 0 0 30%;

        }
        .card {
            height: 120px;
            margin: 20px 5px 20px 5px;
        }
        .card img {
            width: 100%;
            height: 70%;
        }
        .card p {
            text-align: center;
            font-size: 13px;
            color: #9b9b9b;
        }
        .row{
            display: flex;
            padding: 5px 5px 5px 5px;
            flex-wrap: wrap;
        }
    </style>
</head>
<body>
<%
    Book book = (Book) request.getAttribute("book");
    pageContext.setAttribute("book", book);
%>
<div class="top">
    <jsp:include page="header.jsp"/>
</div>
<div class="search-wrap">
    <p style="font-size: 30px;align-items: center">读书时刻:
        <input placeholder="搜索你喜欢的书" type="text" class="search-text" id="search">
        <button type="button" class="btn" onclick="getByName()"><i class="iconfont">&#xe61e;</i></button>
    </p>
</div>
<div class="container">
    <div class="left">
        <div class="header">
            <span><img src="/images/${book.cover}" alt="" class="card"></span>
            <p style="font-size:16px;margin-left: 150px;margin-top: -140px">作者：${book.author}</p>
            <p style="font-size:16px;margin-left: 150px;margin-top: 10px">出版社：小米出版社</p>
            <p style="font-size:16px;margin-left: 150px;margin-top: 10px">章数：102章</p>
            <p style="font-size:16px;margin-left: 150px;margin-top: 10px">发布日期：2016年6月12日</p>

        </div>
        <div style="margin-top: 20px" class="bq">
            内容介绍···
        </div>
        <p class="dl">
            鲁敏的中短篇作品集。小说对日常琐屑生活无比厌倦，但在精细的细节叙述中似乎又表达了作家深切的迷恋。
            柴米油盐、婚配嫁娶、家长里短， 将庸常无比的生活在真实犀利甚至尖刻的话语叙述中彻底撕裂。但惟有父亲不能遗忘，
            他那难以复原的历史如影随形，在与现实的比较中神秘而久远……
        </p>
        <div class="bq">
            作者介绍···
        </div>
        <p class="dl">
            鲁敏，女，二十世纪七十年代出生。从小在乡村长大。十八岁开始工作，先后做过邮局营业员、秘书、企划、宣传、记者、公务员等职。
            已出版《六人晚餐》《纸醉》、《取景器》、《离歌》、《伴宴》、《此情无法投递》、《百恼汇》、《戒指》等十一部作品。
            曾获鲁迅文学奖、庄重文文学奖、人民文学奖、中国作家奖、首届中国小说双年奖、《小说选刊》读者最喜爱小说奖、《小说月报》百花奖、年度青年作家奖。
            并入选《人民文学》未来大家TOP20、台湾《联合文学》等。有作品译为德、法、俄、英等文字。 现为江苏省作协副主席，定居江苏南京。
        </p>
    </div>

    <div class="right">
    <h3>每日推荐:</h3>
        <hr>
        <div class="row">
        <%
            List<Book> bookList = (List<Book>) request.getAttribute("booklist");
            for (Book book1 : bookList) {
                if(book1.getId().equals(book.getId())){
                    continue;
                }
                if(book1.getId()>=11){
                    break;
                }
                pageContext.setAttribute("book1", book1);
        %>
        <div class="column card">
            <a href="${pageContext.request.contextPath}/detail/${book1.id}">
<%--                相对路径--%>
                <img src="/images/${book1.cover}" alt=""></a>
            <p style="color: rgb(51, 119, 178)">${book1.name}</p>
            <p>${book1.author}</p>
        </div>
        <%
            }
        %>
    </div>
    </div>
</div>
</body>
<script>
    function getByName() {
        var bookName = document.getElementById("search");
        var value = bookName.value;
        location.href = "home?bookName="+value;
    }
</script>
</html>
