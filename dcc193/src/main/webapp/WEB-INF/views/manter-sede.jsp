<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h4>Manter Sede</h4>

<form action="/sedes/manter" method="post">
	<input type="hidden" name="sedeId" value="${sede.sedeId}">
    <div class="form-group">
        <label>Nome Fantasia</label>
        <input required type="text" name="nomeFantasia" class="form-control" value="${sede.nomeFantasia}">
    </div>
    <div class=" row form-group">
        <div class="col-md-6">
            <label>Cidade</label>
            <input required type="text" name="cidade" class="form-control" value="${sede.cidade}">
        </div>
        <div class="col-md-6">
            <label>Bairro</label>
            <input required type="text" name="bairro" class="form-control" value="${sede.bairro}">
        </div>
    </div>
    <div class="row form-group">
            <div class="col-md-6">
            <label>Estado</label>
            <input required type="text" name="estado" class="form-control" value="${sede.estado}">
        </div>
        <div class="col-md-6">
            <label>Site</label>
            <input required type="text" name="site" class="form-control" value="${sede.site}">
        </div>
    </div>
    <div class="form-group">
    	<div>
    		<label>Telefone</label>
        	<input required type="text" name="telefone" class="form-control" value="${sede.telefone}">
        </div>
    </div>
    <button type="submit" class="btn btn-success">Salvar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/sedes" class="btn btn-danger">Cancelar</a>
</form>
<%@include file="jspf/rodape.jspf" %>