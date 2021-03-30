package com.soil;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App
{
    
    public static void main( String[] args )
    {
        Calculos_CorrecaoCTC correcaoCtc = new Calculos_CorrecaoCTC();
        Calculos_CorrecaoFosforo correcaoFosforo = new Calculos_CorrecaoFosforo();
        Calculos_CorrecaoPotassio correcaoPotassio = new Calculos_CorrecaoPotassio();

        double teor_fosforo_ideal=0;
        double teor_calcio_ideal=0;
        double teor_potassio_ideal=0;
        double teor_magnesio_ideal=0;
        double teor_enxofre_ideal =0;
        double teor_aluminio_ideal = 0;
        double teor_fosforo_solo=8.59;
        double teor_calcio_solo=5.76;
        double teor_potassio_solo=0.15;
        double teor_magnesio_solo=1.63;
        double teor_enxofre_solo =3.67;
        double teor_aluminio_solo = 0;
        double h_Al=0;
        double result_Scmol=0;
        double result_CTCcmol=0;
        double result_V_At=0;     
        double mo_percentual = 0;   
        double calc_carbono = 0;   
        double textura = 1;
        double quantidade_aplicarFosforo = 0;
        double superfosfato_simples = 0;
        double enxofre = 0;
        double custo_fosforo = 0;
        double potassio_solo = 0;
        double potassio_desejada = 0;
        double quantidade_aplicarPotassio = 0;
        double custo_potassio = 0;

        h_Al = 5.35;

        if(textura == 1){
            teor_potassio_ideal = 0.35;
        }else if(textura ==2){
            teor_potassio_ideal = 0.25;
        }
        

        if(textura == 1){
            teor_fosforo_ideal = 9;
        }else if(textura == 2){
            teor_fosforo_ideal = 12;
        }

        if(textura== 1){
            teor_calcio_ideal = 6;
        }else if(textura == 2){
            teor_calcio_ideal = 4;
        }
        
        if(textura == 1){
            teor_magnesio_ideal = 1.5;
        }else if(textura == 2){
            teor_magnesio_ideal = 1;
        }
        if(textura == 1){
            teor_enxofre_ideal = 9;
        }else if(textura == 2){
            teor_enxofre_ideal = 6;
        }
        result_V_At = correcaoCtc.V_At(teor_calcio_solo, teor_magnesio_solo, teor_potassio_solo, h_Al);
        result_Scmol = correcaoCtc.S_cmol(teor_calcio_solo, teor_magnesio_solo, teor_potassio_solo);
        result_CTCcmol = correcaoCtc.CTC_cmol(teor_calcio_solo, teor_magnesio_solo, teor_potassio_solo,h_Al);
        mo_percentual = correcaoCtc.MO_Percentual(30.7);
        calc_carbono = correcaoCtc.Calcula_Carbono(30.7);
        quantidade_aplicarFosforo = correcaoFosforo.quantidadeAplicar(12, 1, teor_fosforo_solo, 0.7);
        superfosfato_simples = correcaoFosforo.superfosfato_Simples(12, 1, quantidade_aplicarFosforo, teor_fosforo_solo, 0.7);
        enxofre = correcaoFosforo.enxofre(quantidade_aplicarFosforo, 1);
        custo_fosforo = correcaoFosforo.custoFosforo(1, quantidade_aplicarFosforo, 1260);
        potassio_solo = correcaoPotassio.potassioCtcSolo(5.76, 1.63, 0.15,h_Al);
        potassio_desejada = correcaoPotassio.potassioCtcDesejada(textura);
        quantidade_aplicarPotassio = correcaoPotassio.quantidadeAplicarPotassio(1,0.15,potassio_desejada,potassio_solo);
        custo_potassio = correcaoPotassio.custoPotassio(2500, 450.55, 1);
        System.out.printf("Resultado S Cmol = %.2f\n",result_Scmol);
        System.out.printf("Resultado CTC Cmol = %.2f\n",result_CTCcmol);
        System.out.printf("Resultado V Atual = %.2f\n",result_V_At);
        System.out.printf("Resultado Mo_Percentual = %.2f %%\n",mo_percentual);
        System.out.printf("Resultado Calculo do Carbono = %.2f\n",calc_carbono);
        System.out.printf("Quantidade Aplicar Fosforo= %.2f\n",quantidade_aplicarFosforo);
        System.out.printf("Superfosfato Simples= %.2f\n",superfosfato_simples);
        System.out.printf("Enxofre= %.2f\n",enxofre);
        System.out.printf("Custo fosforo= %.2f\n",custo_fosforo);
        System.out.printf("Participação atual do POTASSIO na CTC do solo= %.2f %%\n",potassio_solo);
        System.out.printf("Participação atual do POTASSIO na CTC desejada= %.2f %%\n",potassio_desejada);
        System.out.printf("Quantidade Aplicar Potassio= %.2f\n",quantidade_aplicarPotassio);
        System.out.printf("Custo Potassio= %.2f\n",custo_potassio);










        System.out.printf("Teor Potassio ideal= %.2f\n",teor_potassio_ideal);
        System.out.printf("Teor Fosforo ideal = %.2f\n",teor_fosforo_ideal);
        System.out.printf("Teor Calcio ideal= %.2f\n",teor_calcio_ideal);
        System.out.printf("Teor Magnesio ideal= %.2f\n",teor_magnesio_ideal);
        System.out.printf("Teor Enxofreo ideal= %.2f\n",teor_enxofre_ideal);

    }
    

    

}
