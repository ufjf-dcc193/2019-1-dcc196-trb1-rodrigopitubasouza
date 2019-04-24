<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<div>
	<h4>Manter Sede</h4>
	<a class="btn btn-primary text-center" href= "sedes/cadastrar">Cadastrar Sedes</a>
</div>
<div class="text-center">
<c:choose>
	<c:when test="${empty sedes}">
	<span>Não existem sedes cadastradas</span>
	</c:when>
	<c:otherwise>
		<table class="table table-striped">
    	    <thead>
	    	    <th>Sede</th>
           		<th>Estado</th>
            	<th>Cidade</th>
            	<th>Bairro</th>
            	<th>Telefone</th>
            	<th>Site</th>
            	<th>Ações</th>
            </thead>
         	<tbody>
            	<c:forEach  var="sede" items="${sedes}">
            		<tr>
                		<td>${sede.getNomeFantasia()}</td>
                		<td>${sede.getEstado()}</td>
                		<td>${sede.getCidade()}</td>
                		<td>${sede.getBairro()}</td>
                		<td>${sede.getTelefone()}</td>
                		<td><a>${sede.getSite()}</a></td>
                		<td colspan="2">
                    		<a class="btn btn-primary" href="sedes/editar/${sede.sedeId}">Editar</a>
                    		<a class="btn btn-danger" href="sedes/excluir/${sede.sedeId}">Excluir</a>
                		</td>
            		</tr>
            	</c:forEach>
            </tbody>
        </table>	
	</c:otherwise>
</c:choose>
</div>
<%@include file="jspf/rodape.jspf" %>