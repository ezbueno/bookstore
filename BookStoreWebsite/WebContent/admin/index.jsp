<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin. da Evergreen Bookstore</title>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	
	<div align="center">
		<h2>Painel Administrativo</h2>
	</div>
	
	<div align="center">
		<hr width="60%"/>
		<h2>Ações Rápidas:</h2>
		<b>
		<a href="create_book">Novo Livro</a> &nbsp;
		<a href="create_user">Novo Usuário</a> &nbsp;
		<a href="create_category">Nova Categoria</a> &nbsp;
		<a href="create_customer">Novo Cliente</a> &nbsp;
		</b>
	</div>
	
	<div align="center">
		<hr width="60%"/>
		<h2>Vendas Recentes</h2>
	</div>
	
	<div align="center">
		<hr width="60%"/>
		<h2>Avaliações Recentes</h2>
	</div>
	
	<div align="center">
		<hr width="60%"/>
		<h2>Estatísticas</h2>
		<hr width="60%"/>
	</div>	
	
	<jsp:directive.include file="footer.jsp"/>
</body>
</html>