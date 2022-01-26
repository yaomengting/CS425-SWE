package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> cartlineList = new ArrayList<CartLine>();


		public void addToCart(Product product){
			if (productExists(product)){
				addExistingProduct(product);
			}else {
				addNewProduct(product);
			}
		}

		private void addNewProduct(Product product){
			CartLine cartLine = new CartLine();
			cartLine.setProduct(product);
			cartLine.setQuantity(1);
			cartlineList.add(cartLine);
		}

		private void addExistingProduct(Product product){
		for (CartLine cartLine : cartlineList){
			if (isProductInCartLine(product, cartLine)){
				cartLine.setQuantity(cartLine.getQuantity() + 1);
				return;
			}
		}
	}

		private boolean productExists(Product product){
			for (CartLine cartLine : cartlineList){
				if (isProductInCartLine(product, cartLine)){
					return true;
				}
			}
			return false;
		}

		public void print () {
		System.out.println("Content of the shoppingcart:");
		for (CartLine cartLine : cartlineList) {
			System.out.println(cartLine.getQuantity() + " "
					+ cartLine.getProduct().getProductnumber() + " "
					+ cartLine.getProduct().getDescription() + " "
					+ cartLine.getProduct().getPrice());
		}
		System.out.println("Total price =" + getTotalPrice());
	}


		// get total price
		public double getTotalPrice () {
		double totalPrice = 0.0;

		for (CartLine cartLine : cartlineList) {
			totalPrice = totalPrice + (cartLine.getProduct().getPrice() * cartLine.getQuantity());
		}
		return totalPrice;
	}


			public void removeFromCart(Product product){
			Iterator<CartLine> iter = cartlineList.iterator();
			while (iter.hasNext()){
				CartLine cartLine = iter.next();
				if (isProductInCartLine(product, cartLine)){
					if (cartLine.getQuantity() > 1){
						cartLine.setQuantity(cartLine.getQuantity()-1);
					}
					else {
						iter.remove();
					}
				}
			}
			}

			private boolean isProductInCartLine(Product product, CartLine cartLine){
			return cartLine.getProduct().getProductnumber().equals(product.getProductnumber());
			}
		}
