#include<stdio.h>

#define LINHAS 10
#define COLUNAS 10

int main(){

    int matriz [LINHAS][LINHAS] = {0};

    int navio1[3] = {3 , 3 , 3};
    int navio2[3] = {3 , 3 , 3};
    int navio3[3] = {3 , 3 , 3};
    int navio4[3] = {3 , 3 , 3};

    //POSIÇÕES INICIAIS
    int linhainicial1 = 0;
    int colunainicial1 = 0;

    int linhainicial2 = 3;
    int colunainicial2 = 3;

    int linhainicial3 = 5;
    int colunainicial3 = 0;

    int linhainicial4 = 0;
    int colunainicial4 = 9;

    int i;
//HORIZONTAL
    for(i = 0; i< 3; i++){
        matriz[linhainicial1][colunainicial1 + i] = navio1[i];
    }
//VERTCAL
    for(i = 0; i< 3; i++){
        matriz[linhainicial2 + i][colunainicial2] = navio2[i];}

//DIAGONAL

    for(i = 0; i< 3; i++){
            matriz[linhainicial3 + i][colunainicial3 + i] = navio3[i];
    }

    for(i = 0; i< 3; i++){
        matriz[linhainicial4 + i][colunainicial4 - i] = navio4[i];
    }

    int matrizcone[5][5] = {0};
    int linhainicialcone = 0;
    int colunainicialcone = 0;

    printf("Insira a linha do seu cone: ");
    scanf("%d", &linhainicialcone);
    printf("Insira a coluna do seu cone: ");
    scanf("%d", &colunainicialcone);

    int x;

    for(x = 0; x < 5; x++){
        for(int y = 0; y < 5; y++){
            matrizcone[x][y] = 1;
            printf("%d ", matrizcone[x][y]);
        }
    }

    // Preenche a matriz do cone


    printf("Tabuleiro:\n");

    for(int linha = 0; linha < LINHAS; linha++){
        for(int coluna = 0; coluna < COLUNAS; coluna++){
            printf("%d ", matriz[linha][coluna]);
        }
        printf("\n");
    }
    
    return 0;
    }