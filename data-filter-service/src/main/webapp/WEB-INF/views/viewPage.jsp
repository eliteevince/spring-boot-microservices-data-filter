<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .container h1{
                color: #b54656;
            }
            .container ul {
                padding: 0;
            }
            .container ul li:hover {
                background-color: #ff6666;
            }
            .container ul li {
                background-color: #00ccff;
                padding: 15px;
                margin: 15px;
                border-radius: 5px;
                color: white;
            }   
            .container input[type="text"] {
                width: 98%;
                height: 30px;
                padding: 0 0 0 2%;
            }
            .container {
                width: 60%;
                margin: auto;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>EliteEvince Spring Micro Service Demo (Data-Filter)</h1>
            <form id="form" method="get">
                <input type="text" id="word" placeholder="Search By Name" onkeyup="search(event, this.value)">
            </form>
            <ul>
                <c:forEach var="window" items="${list}"> 
                    <li><c:out value="${window.getId()}. ${window.getName()}"/> </li>
                </c:forEach>
            </ul>
        </div>
        <script>
            
            document.getElementById('word').focus();
            document.getElementById('form').addEventListener('submit', function (e) {
                e.preventDefault();
            }, false);

            function search(e, word) {
                if (e.keyCode === 13) {
                    var form = document.getElementById("form");
                    form.action = "http://localhost:8080/data-filter-service/" + word;
                    form.submit();
                }
                return false;
            }
        </script>
    </body>
</html>
