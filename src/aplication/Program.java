package aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); //Injeção de dependência sem explicitar a implementação
		
		System.out.println("=== Test 1: seller findById === ");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: seller findByDepartment === ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== Test 3: seller findAll === ");
		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== Test 4: seller insert === ");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3500.0, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller);
		
		System.out.println("\n=== Test 5: seller Update === ");
		seller = sellerDao.findById(1);
		seller.setName("Lauren Hill");
		seller.setEmail("laurenHill@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed! ");
		 */
		
		
		System.out.println("\n=== Test 6: seller Delete === ");
		System.out.println("Enter with id for delete: ");
		int id = sc.nextInt();
		seller = sellerDao.findById(10);
		sellerDao.deleteById(id);
		System.out.println("Delete completed! ");
		
		
		sc.close();
	}

}
