package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackEnd
{
    private ArrayList<String> CSVData;
    private ArrayList<String> names;
    private ArrayList<Integer> scores;
    private Path path;
    private int numColumns;

    public BackEnd(String path)
    {
        this.path = Paths.get(new File(path).getPath());
        this.names = new ArrayList<>();
        this.scores = new ArrayList<Integer>();
        try (BufferedReader br = (BufferedReader) Files.newBufferedReader(Paths.get(path),
                StandardCharsets.US_ASCII))
        {
            String line = br.readLine();
            while (line != null)
            {
                String[] values = line.split(",");
                names.add(values[0]);
                scores.add(Integer.parseInt(values[1]));
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public List<String> getColumnHeaders()
    {
        return new ArrayList<>(Arrays.asList(this.CSVData.get(0).split(",")));
    }

    public List<String> getDataString(int column)
    {
        ArrayList<String> x = new ArrayList<String>();
        for (int i = 1; i < this.CSVData.size(); i++) {
            x.add(this.CSVData.get(i).split(",")[column]);
        }
        return x;
    }

    public List<Integer> getDataInt(int column)
    {
        List<String> a = getDataString(column);
        List<Integer> b = new ArrayList<>();
        for (String str : a) {
            System.out.println(str);
            b.add(Integer.parseInt(str));
        }
        return b;
    }

    public List<Double> getDataDouble(int column)
    {
        List<String> a = getDataString(column);
        List<Double> b = new ArrayList<>();
        for (String str : a)
            b.add(Double.parseDouble(str));
        return b;
    }
}