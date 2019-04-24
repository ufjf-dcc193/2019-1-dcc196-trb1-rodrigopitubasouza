<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<div>
	<h4>Horas por Sede</h4>
</div>
<div class="text-center">
<c:choose>
	<c:when test="${empty horas}">
	<span>Não existem atividades cadastradas</span>
	</c:when>
	<c:otherwise>
		<table class="table table-striped">
    	    <thead>
    	        <th>Sede</th>
            	<th>Horas Assistenciais</th>
            	<th>Horas Juridicas</th>
            	<th>Horas Financeiras</th>
            	<th>Horas Executivas</th>
            	<th>Horas Totais</th>
            </thead>
         	<tbody>
            	<c:forEach  var="atividade" items="${horas}">
            		<tr>
            			<td>${atividade.getSede().getNomeFantasia()}</td>
                		<td>${atividade.getHorasAssistencial()}</td>
                		<td>${atividade.getHorasJuridica()}</td>
                		<td>${atividade.getHorasFinanceira()}</td>
                		<td>${atividade.getHorasExecutiva()}</td>
						<td>${atividade.getHorasExecutiva() + atividade.getHorasAssistencial() + atividade.getHorasJuridica() + atividade.getHorasFinanceira()}</td>
            		</tr>
            	</c:forEach>
            </tbody>
        </table>	
	</c:otherwise>
</c:choose>
</div>
<%@include file="jspf/rodape.jspf" %>