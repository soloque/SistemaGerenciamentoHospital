package sistemagerenciamentohospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hospital {
    private List<Paciente> pacientes;
    private List<Medico> medicos;

    public Hospital() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    public Paciente buscarPaciente(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }

    public void alterarCadastroPaciente(String nome) {
        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Alterando cadastro do paciente: " + paciente.getNome());
            System.out.println("1. Tipo Sanguíneo: " + paciente.getTipoSanguineo());
            System.out.println("2. Tipo de Convênio: " + paciente.getTipoConvenio());
            System.out.println("3. Outras Doenças: " + paciente.getOutrasDoencas());
            System.out.println("4. Alergia a Substâncias: " + (paciente.hasAlergiaSubstancias() ? "Sim" : "Não"));
            System.out.println("5. Alta: " + (paciente.isAlta() ? "Sim" : "Não"));
            System.out.println("0. Voltar");

            int opcao = -1;
            while (opcao != 0) {
                System.out.print("Digite o número da opção desejada: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o novo tipo sanguíneo: ");
                        String novoTipoSanguineo = scanner.nextLine();
                        paciente.setTipoSanguineo(novoTipoSanguineo);
                        System.out.println("Tipo sanguíneo alterado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Digite o novo tipo de convênio (basico, comum, premium): ");
                        String novoTipoConvenio = scanner.nextLine();
                        paciente.setTipoConvenio(novoTipoConvenio);
                        System.out.println("Tipo de convênio alterado com sucesso!");
                        break;
                    case 3:
                        System.out.print("Digite as novas outras doenças (separadas por vírgula): ");
                        String novasDoencas = scanner.nextLine();
                        List<String> listaDoencas = new ArrayList<>();
                        String[] doencas = novasDoencas.split(",");
                        for (String doenca : doencas) {
                            listaDoencas.add(doenca.trim());
                        }
                        paciente.setOutrasDoencas(listaDoencas);
                        System.out.println("Outras doenças alteradas com sucesso!");
                        break;
                    case 4:
                        System.out.print("O paciente possui alergia a substâncias (true/false)? ");
                        boolean novaAlergia = scanner.nextBoolean();
                        paciente.setAlergiaSubstancias(novaAlergia);
                        System.out.println("Alergia a substâncias alterada com sucesso!");
                        break;
                    case 5:
                        System.out.print("O paciente recebeu alta (true/false)? ");
                        boolean novaAlta = scanner.nextBoolean();
                        paciente.setAlta(novaAlta);
                        System.out.println("Alta alterada com sucesso!");
                        break;
                    case 0:
                        System.out.println("Retornando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico cadastrado com sucesso!");
    }

     Medico buscarMedico(String nomeMedicoConsulta) {
        for (Medico medico : medicos) {
            if (medico != null && medico.getNome() != null && medico.getNome().equalsIgnoreCase(nomeMedicoConsulta)) {
                return medico;
            }
        }
        return null;
    }

}
