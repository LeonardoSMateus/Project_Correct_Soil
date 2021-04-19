<!DOCTYPE html>
<html>
<pre>
Nome: Carlos Vinicius R Gonçalves Ra:1914723
# Project_Correct_Soil
cloc Calculos_CorrecaoFosforo.java
       1 text file.
       1 unique file.
       0 files ignored.

http://cloc.sourceforge.net v 1.64  T=0.04 s (28.1 files/s, 1741.7 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1              7              2             53
-------------------------------------------------------------------------------
Problemas Identificados:
       comentários desnecessários
       linhas em branco
       Chaves consumindo espaços desnecessários
       Váriaveis desnecessárias,  double quantidade_aplicar ,teor_p2O5, mmb24.
       Else desnecessários
       Operações com valores multplicados e divididos
       
Soluções Encontradas:
       Na função quantidadeAplicar foi entendido melhor o problema e foi observado que o else não<br>  é necessário já que se não cair na condição if, o codigo deve retornar mesmo a <br>operacão de quantidade a aplicar, e tambem nessa operação o valor 100 é multiplicado e <br>dividio assim desnecessário.Em seguida na  função superfosfato_Simples tem um Else que <br>não é necessario pois o se a condição cair no if ela tem um retorno assim não é preciso <br>de um else. Nessa mesma função é possível ver a variavel mmb24 é multiplicada por 2,42 <br>e 100 mas logo em seguida é divida por o mesmo valor assim não é necessário este valor, <br>está variavel será excluida tbm pois o codigo dela pode ser colocado direto. 

Código após as modificações:

Commit: 849495ce9510f3b5218d2370ea99eb7849677276
       cloc Calculos_CorrecaoFosforo.java
              1 text file.
              1 unique file.
              0 files ignored.

       http://cloc.sourceforge.net v 1.64  T=0.01 s (108.4 files/s, 4009.5 lines/s)
       -------------------------------------------------------------------------------
       Language                     files          blank        comment           code
       -------------------------------------------------------------------------------
       Java                             1              0              0             37
       -------------------------------------------------------------------------------
 <pre>
</html>
