//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----- PBL04 -----");

        Professor professor = new Professor("Marina", "932482384");
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", professor);
        Aluno aluno = new Aluno("Rafael Freitas", "823477327");

        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);

        disciplina.matricularAluno(new Aluno("Matheus Giaretta", "638492840"));
        disciplina.matricularAluno(new Aluno("Felipe Freitas", "738194032"));

        Puc puc = new Puc(new Professor("Marina", "932482384"));
        System.out.println("Professor da politécnica: " + puc.getNomeProfessor() + "\n");

        disciplina.substituirProfessor("852963741", "Sheila");

        System.out.println("Nome do professor na classe Main: " + professor.getNome());

        disciplina.imprimirInfo();

        System.out.println("Professor da politécnica: " + puc.getProfessor().getNome());

        System.out.println(professor);
        System.out.println(disciplina.getProfessor());


    }
}