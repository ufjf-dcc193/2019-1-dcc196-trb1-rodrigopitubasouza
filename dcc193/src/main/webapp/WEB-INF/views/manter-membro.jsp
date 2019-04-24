<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h4>Manter membro</h4>

<form action="/membros/manter" method="post">
	<input type="hidden" name="membroId" value="${membro.membroId}">
    <div class="form-group">
        <label>Nome</label>
        <input required type="text" name="nome" class="form-control" value="${membro.nome}">
    </div>
    <div class=" row form-group">
        <div class="col-md-6">
            <label>Função</label>
            <input required type="text" name="funcao" class="form-control" value="${membro.funcao}">
        </div>
        <div class="col-md-6">
            <label>E-mail</label>
            <input required type="text" name="email" class="form-control" value="${membro.email}">
        </div>
    </div>
    <div class="row form-group">
            <div class="col-md-6">
            <label>Data de Entrada</label>
            <input required type="date" name="estado" class="form-control" value="${membro.dataEntrada}">
        </div>
        <div class="col-md-6">
            <label>Data de Saída</label>
            <input required type="date" name="site" class="form-control" value="${membro.dataSaida}">
        </div>
    </div>
    <div class="form-group">
    	<div>
    		<label>Sede</label>
        	<select name="sede" class="form-control" required>
            	<option selected value="">Selecione</option>
            		<c:forEach var="sede" items="${sedes}">
                			<option
                			${sede.nomeFantasia eq membro.sede.nomeFantasia ? 'selected="selected"' : ''}
                			 value="${sede.sedeId}">${sede.nomeFantasia}</option>
            		</c:forEach>
        	</select>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Salvar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/membros" class="btn btn-danger">Cancelar</a>
</form>
<%@include file="jspf/rodape.jspf" %>