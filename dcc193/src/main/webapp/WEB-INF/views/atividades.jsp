<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<div>
	<h4>Manter Atividade</h4>
	<c:choose>
		<c:when test="${empty sedes}">
			<span>Para cadastrar atividades é necessário ter sedes Cadastradas</span>
		</c:when>
		<c:otherwise>
			<a class="btn btn-primary text-center" href= "atividades/cadastrar">Cadastrar Atividades</a>
		</c:otherwise>
	</c:choose>
</div>
<div class="text-center">
<c:choose>
	<c:when test="${empty atividades}">
	<span>Não existem atividades cadastradas</span>
	</c:when>
	<c:otherwise>
		<table class="table table-striped">
    	    <thead>
	    	    <th>Título</th>
           		<th>Descrição</th>
            	<th>Data de Inicio</th>
            	<th>Data de fim</th>
            	<th>Horas Assistenciais</th>
            	<th>Horas Juridicas</th>
            	<th>Horas Financeiras</th>
            	<th>Horas Executivas</th>
            	<th>Sede</th>
            	<th>Ações</th>
            </thead>
         	<tbody>
            	<c:forEach  var="atividade" items="${atividades}">
            		<tr>
                		<td>${atividade.getTitulo()}</td>
                		<td>${atividade.getDescricao()}</td>
                		<td>${atividade.getDataInicio()}</td>
                		<td>${atividade.getDataFim()}</td>
                		<td>${atividade.getHorasAssistencial()}</td>
                		<td>${atividade.getHorasJuridica()}</td>
                		<td>${atividade.getHorasFinanceira()}</td>
                		<td>${atividade.getHorasExecutiva()}</td>
                		<td><a>${atividade.getSede()}</a></td>
                		<td colspan="2">
                    		<a class="btn btn-primary" href="atividades/editar/${atividade.getAtividadeId()}">Editar</a>
                    		<a class="btn btn-danger" href="atividades/excluir/${atividade.getAtividadeId()}">Excluir</a>
                		</td>
            		</tr>
            	</c:forEach>
            </tbody>
        </table>	
	</c:otherwise>
</c:choose>
</div>
<%@include file="jspf/rodape.jspf" %>