<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<div>
	<h4>Manter Membro</h4>
	<c:choose>
		<c:when test="${empty sedes}">
			<span>Para cadastrar membros é necessário ter sedes Cadastradas</span>
		</c:when>
		<c:otherwise>
			<a class="btn btn-primary text-center" href= "membros/cadastrar">Cadastrar Membros</a>
		</c:otherwise>
	</c:choose>
</div>
<div class="text-center">
<c:choose>
	<c:when test="${empty membros}">
	<span>Não existem membros cadastrados</span>
	</c:when>
	<c:otherwise>
		<table class="table table-striped">
    	    <thead>
	    	    <th>Membro</th>
           		<th>Função</th>
            	<th>E-mail</th>
            	<th>Data de Entrada</th>
            	<th>Data de Saída</th>
            	<th>Sede</th>
            	<th>Ações</th>
            </thead>
         	<tbody>
            	<c:forEach  var="membro" items="${membros}">
            		<tr>
                		<td>${membro.getNome()}</td>
                		<td>${membro.getFuncao()}</td>
                		<td>${membro.getEmail()}</td>
                		<td>${membro.getDataEntrada()}</td>
                		<td>${membro.getDataSaida()}</td>
                		<td>${membro.getSede()}</td>
                		<td colspan="2">
                    		<a class="btn btn-primary" href="membros/editar/${membro.getMembroId()}">Editar</a>
                    		<a class="btn btn-danger" href="membros/excluir/${membro.getMembroId()}">Excluir</a>
                		</td>
            		</tr>
            	</c:forEach>
            </tbody>
        </table>	
	</c:otherwise>
</c:choose>
</div>
<%@include file="jspf/rodape.jspf" %>