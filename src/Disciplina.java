public class Disciplina {
    private String nome;
    private Professor professor;
    private Aluno[] alunos = new Aluno[10];

    private int qntAlunos = 0;
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public Disciplina(String nome, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void matricularAluno(Aluno aluno) {
        if (qntAlunos == 10) {
            System.out.println("Esta turma já está cheia");
            return;
        }
        alunos[qntAlunos] = aluno;
        qntAlunos++;

        System.out.println(aluno.getNome() + " foi matriculado.");
    }

    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome() + "\n");
        System.out.println("Alunos Matriculados: ");
        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i].getNome());
        }
        System.out.print("-------------------------------\n\n");
    }

    public void substituirProfessor(String codRh, String nome) {
        this.professor.setCodRh(codRh);
        this.professor.setNome(nome);
    }
}
