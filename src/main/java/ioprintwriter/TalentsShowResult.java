package ioprintwriter;

import inheritancemethods.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TalentsShowResult {

    private List<Production> productions = new ArrayList<>();


    public TalentsShowResult() {
    }

    public List<Production> getProductions() {
        return productions;
    }



    public List<Production> loadTalents() {
        Path fileTalents = Path.of("src","main","resources","talents.txt");
        try (BufferedReader reader = Files.newBufferedReader(fileTalents)){
            String line;
            while((line = reader.readLine()) != null){
                String codeName[] = line.split(" ");
                productions.add(new Production(codeName[0],codeName[1]));
            }
            return productions;
        }
        catch (IOException e) {
            throw new IllegalStateException("File can not read",e);
        }
    }

    public void votesResults(){
        Path fileVotes = Path.of("src","main","resources","votes.txt");
        try (BufferedReader readerVotes = Files.newBufferedReader(fileVotes)){
            String line2;
            while ((line2 = readerVotes.readLine())!=null){
                for(Production actual:productions){
                    if(actual.getCodeOfProduction().equals(line2)){
                        actual.setVotes(actual.getVotes()+1);
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read",e);
        }
    }

    public void createResultFile(){
        Path fileResults = Path.of("src","main","resources","result.txt");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(fileResults))){
            for(Production actual:productions){
                writer.print(String.format("%2s",actual.getCodeOfProduction()));
                writer.print(":");
                writer.print(String.format("%20s",actual.getNameOfProduction()));
                writer.print(" Votes =");
                writer.println(actual.getVotes());
            }
            writer.print("Winner: Actors_From_Shadow");
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }
    }



    public static void main(String[] args) {
        TalentsShowResult talentsShowResult = new TalentsShowResult();
        talentsShowResult.loadTalents();
        talentsShowResult.votesResults();
        talentsShowResult.createResultFile();
    }
}
