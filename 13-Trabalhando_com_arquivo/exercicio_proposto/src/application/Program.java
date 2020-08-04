package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String path = "/home/rodrigo/Tec/JAVA";
		
		boolean success = new File(path + "/out").mkdir();
		System.out.println("A pasta foi criada: " + success);
		
		List<Products> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path + "/summary.csv"))){
			
			String linhaCsv = br.readLine();
			while (linhaCsv != null) {
				
				String[] linha = linhaCsv.split(",");
				String name = linha[0];
				double price = Double.parseDouble(linha[1]);
				int quantity = Integer.parseInt(linha[2]);
				
				list.add(new Products(name, price, quantity));
				
				linhaCsv = br.readLine();
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/out/summary.csv"))){
				
				for (Products item: list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.mult()));
					bw.newLine();
				}
				
				System.out.println("Created");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
