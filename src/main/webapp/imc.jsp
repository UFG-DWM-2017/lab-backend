<%@ page contentType="text/html; charset=utf-8" %>
<html>
<body>
<h1>Cálculo de IMC</h1>
<form>
    Peso:
    <input type="text" name="peso">
    <br>
    Altura:
    <input type="text" name="altura">
    <button>Calcular</button>
</form>
<%
    String pesoStr = request.getParameter("peso");
    String alturaStr = request.getParameter("altura");
    if (pesoStr != null && alturaStr != null) {
        int peso = Integer.parseInt(pesoStr);
        float altura = Float.parseFloat(alturaStr);
        float resultado = peso / (altura * altura);
        if (resultado < 17) {
%><b>Muito abaixo do peso.</b><%
        } else if (resultado < 18.49) {
%><b>Abaixo do peso.</b><%
        } else if (resultado < 24.99) {
%><b>Peso normal.</b><%
        } else if (resultado < 29.99) {
%><b>Acima do peso.</b><%
        } else if (resultado < 34.99) {
%><b>Obesidade I.</b><%
        } else if (resultado < 39.99) {
%><b>Obesidade II (severa).</b><%
        } else {
%><b>Obesidade III (mórbida).</b><%
        }
    }
%>
</body>
</html>
