<%-- 
    Document   : resposta
    Created on : 29 de abr. de 2023, 10:01:05
    Author     : urlas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Palavra traduzida</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1 class="h1 text-center" style="margin-top: 40px">A tradução de ${param.palavra} é ${traducao} </h1>
        <p class="blockquote text-center" style="margin-top: 40px">para voltar para o menu é só apertar o botão de voltar ou alt + seta para esquerda</p>
    </body>
</html>
