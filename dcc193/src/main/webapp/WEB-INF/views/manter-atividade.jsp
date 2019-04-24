<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h4>Manter atividade</h4>

<form action="/atividades/manter" method="post">
	<input type="hidden" name="atividadeId" value="${atividade.getAtividadeId()}">
    <div class=" row form-group">
        <div class="col-md-6">
            <label>Título</label>
            <input required type="text" name="titulo" class="form-control" value="${atividade.titulo}">
        </div>
        <div class="col-md-6">
            <label>Descricao</label>
            <input required type="text" name="descricao" class="form-control" value="${atividade.descricao}">
        </div>
    </div>
    <div class="row form-group">
            <div class="col-md-6">
            <label>Data de Início</label>
            <input required type="date" name="dataInicio" class="form-control" value="${atividade.dataInicio}">
        </div>
        <div class="col-md-6">
            <label>Data Final</label>
            <input required type="date" name="dataFim" class="form-control" value="${atividade.dataFim}">
        </div>
    </div>
        <div class=" row form-group">
        <div class="col-md-4">
           	<label>Horas Assistenciais</label>
            <input required type="number" name="horasAssistencial" class="form-control" value="${atividade.horasAssistencial}">
        </div>
        <div class="col-md-4">
            <label>Horas Jurídicas</label>
            <input required type="number" name="horasJuridica" class="form-control" value="${atividade.horasJuridica}">
        </div>
        <div class="col-md-4">
            <label>Horas Financeiras</label>
            <input required type="number" name="horasFinanceira" class="form-control" value="${atividade.horasFinanceira}">
        </div>
        <div class="col-md-4">
            <label>Horas Executivas</label>
            <input required type="number" name="horasExecutiva" class="form-control" value="${atividade.horasExecutiva}">
        </div>
    </div>
    <div class="form-group">
    	<div>
    		<label>Sede</label>
        	<select name="sede" class="form-control" required>
            	<option selected value="">Selecione</option>
            		<c:forEach var="sede" items="${sedes}">
                			<option
                			${sede.nomeFantasia eq atividade.sede.nomeFantasia ? 'selected="selected"' : ''}
                			 value="${sede.sedeId}">${sede.nomeFantasia}</option>
            		</c:forEach>
        	</select>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Salvar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/atividades" class="btn btn-danger">Cancelar</a>
</form>
<%@include file="jspf/rodape.jspf" %>