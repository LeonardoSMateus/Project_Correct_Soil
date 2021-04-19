<!DOCTYPE html>
<pre>
Autor: Carlos Vinicius R Gonçalves
Curso: Engenharia de Computação
# Project_Correct_Soil
<h2>Código Atual classe Calculos_CorrecaoFosforo</h2>
       1 text file.
       1 unique file.
       0 files ignored.

       http://cloc.sourceforge.net v 1.64  T=0.04 s (28.1 files/s, 1741.7 lines/s)
       -------------------------------------------------------------------------------
       Language                     files          blank        comment           code
       -------------------------------------------------------------------------------
       Java                             1              7              2             53
       -------------------------------------------------------------------------------
<h2>Problemas Identificados:</h2>
      <p> comentários desnecessários
       linhas em branco
       Chaves consumindo espaços desnecessários
       Váriaveis desnecessárias,  double quantidade_aplicar ,teor_p2O5, mmb24.
       Else desnecessários
       Operações com valores multplicados e divididos</p>
       
<h2>Soluções Encontradas:</h2>
<pre>
       <p>Na função quantidadeAplicar foi entendido melhor o problema e foi observado que o else não é necessário já que se não cair na condição if, o codigo deve retornar mesmo a operacão de quantidade a aplicar, e tambem nessa operação o valor 100 é multiplicado e dividio assim desnecessário.Em seguida na  função superfosfato_Simples tem um Else que não é necessario pois o se a condição cair no if ela tem um retorno assim não é preciso de um else. Nessa mesma função é possível ver a variavel mmb24 é multiplicada por 2,42 e 100 mas logo em seguida é divida por o mesmo valor assim não é necessário este valor, está variavel será excluida tbm pois o codigo dela pode ser colocado direto. </p></pre>

<h2>Código após as modificações:</h2>
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
<p>Inicialmente tinhamos 8 estruturas condicionais agora com aas modificações caiu para 6</p>
<h3>-----------------------------------------------------------------------------------------------</h3>
<h2>Código Atual classe Calculos_CorrecaoPotassio</h2>
       1 text file.
       1 unique file.
       0 files ignored.

       http://cloc.sourceforge.net v 1.64  T=0.01 s (117.0 files/s, 4446.5 lines/s)
       -------------------------------------------------------------------------------
       Language                     files          blank        comment           code
       -------------------------------------------------------------------------------
       Java                             1              0              0             38
       -------------------------------------------------------------------------------

<h2>Problemas Identificados:</h2>
      <p> comentários desnecessários
       linhas em branco
       Chaves consumindo espaços desnecessários
       Váriaveis desnecessárias,  double quantidade_aplicar ,k_adicionar
       Quatro ifs desnecessários na função quantidadeAplicarPotassio</p>

<h2>Soluções Encontradas:</h2>
<pre>
       <p>Na função quantidadeAplicarPotassio foi tirada as variaveis double quantidade_aplicar ,k_adicional, 
       no lugar do if foi colocada uma array, que dependendo da fonte_potassioUtilizar ele vai colocar na array o valor correto a fazer </p></pre>
<h2>Código após as modificações:</h2>
Commit: bd1ca51882e9af7e1c8a958c2fe2b2843c5052fa
cloc Calculos_CorrecaoPotassio.java
       1 text file.
       1 unique file.
       0 files ignored.

       http://cloc.sourceforge.net v 1.64  T=0.03 s (33.1 files/s, 728.8 lines/s)
       -------------------------------------------------------------------------------
       Language                     files          blank        comment           code
       -------------------------------------------------------------------------------
       Java                             1              0              0             22
       -------------------------------------------------------------------------------
<p>Inicialmente tinhamos 6 estruturas condicionais agora com as modificações caiu para 2</p>

 <pre>
</html>
