package Lista3;

import java.util.Scanner;

public class Ex5mainTurma {
    public static void main(String[] args) {
        int op;
        int j = 0;
        Ex5aluno[] alunos = new Ex5aluno[999];
        Scanner rc = new Scanner(System.in);
        do{
            System.out.println("\n****** MENU ******");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Buscar um aluno pelo nome");
            System.out.println("3 - Exibir lista de alunos");
            System.out.println("4 - Calcular media da turma");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada:");
            op = rc.nextInt();
            rc.nextLine();
            switch(op){
                case 1:
                    System.out.print("\nDigite a matrícula do aluno: ");
                    int matricula = rc.nextInt();
                    rc.nextLine();
                    System.out.print("\nDigite o nome do aluno: ");
                    String nome = rc.nextLine();
                    System.out.print("\nDigite a primeira nota do aluno: ");
                    double nota1 = rc.nextDouble();
                    System.out.print("\nDigite a segunda nota do aluno: ");
                    double nota2 = rc.nextDouble();
                    alunos[j] = new Ex5aluno(matricula, nome, nota1, nota2);
                    j++;
                    break;
                case 2:
                    System.out.print("\nDigite o nome do aluno: ");
                    String nomeBusca = rc.nextLine();
                    for(int i = 0; i < alunos.length; i++){
                        if(alunos[i] == null){
                            break;
                        }
                        if(alunos[i].getNome().equals(nomeBusca)){
                            System.out.println(alunos[i].toString());
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i < alunos.length; i++){
                        if(alunos[i] == null){
                            break;
                        }
                        System.out.println(alunos[i].toString());
                    }
                    break;
                case 4:
                    double mediaTurma = 0;
                    int i;
                    for(i = 0; i < alunos.length; i++){
                        if(alunos[i] == null){
                            break;
                        }
                        mediaTurma += alunos[i].getMedia();
                    }
                    mediaTurma /= i;
                    System.out.println("\nMédia da turma: " + mediaTurma);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }while(op != 5);
        rc.close();
    }
}
