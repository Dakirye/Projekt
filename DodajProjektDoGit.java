import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DodajProjektDoGit {
    public static void main(String[] args) {
        // Ścieżka do katalogu projektu
        Path sciezkaProjektu = Path.of("ścieżka/do/twojego/projektu");

        try {
            // Inicjalizacja repozytorium Git
            Process gitInit = Runtime.getRuntime().exec("git init", null, sciezkaProjektu.toFile());
            gitInit.waitFor();

            // Dodanie plików do indeksu
            Process gitAdd = Runtime.getRuntime().exec("git add .", null, sciezkaProjektu.toFile());
            gitAdd.waitFor();

            // Zatwierdzenie zmian jako pierwszy commit
            Process gitCommit = Runtime.getRuntime().exec("git commit -m \"Pierwszy commit\"", null, sciezkaProjektu.toFile());
            gitCommit.waitFor();

            // Dodanie repozytorium zdalnego (GitHub)
            String adresRepozytorium = "https://github.com/Dakirye/Projekt";
            Process gitRemoteAdd = Runtime.getRuntime().exec("git remote add origin " + adresRepozytorium, null, sciezkaProjektu.toFile());
            gitRemoteAdd.waitFor();

            // Wysłanie zmian do repozytorium zdalnego
            Process gitPush = Runtime.getRuntime().exec("git push -u origin master", null, sciezkaProjektu.toFile());
            gitPush.waitFor();

            System.out.println("Projekt został dodany do repozytorium Git na GitHubie.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
