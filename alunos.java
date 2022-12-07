public class alunos {
        public static void main(String[] args) {
            double nota1 = 5;
            double nota2 = 8;
            double nota3 = 6;
            double nota4 = 7;

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.printf("As notas do aluno são: %.2f, %.2f, %.2f e %.2f.\n", nota1, nota2, nota3, nota4);
            System.out.printf("A média final é %.2f.\n", media);

            if(media >= 6) {
                System.out.println("O aluno foi aprovado!");
            } else {
                System.out.println("O alno foi reprovado!");
            }
        }
    }

