package it.uniba.aggregator.microservices;

import lombok.Getter;
import lombok.Setter;

/**
 * Encapsulates all the data for a Product that clients will request.
 */
@Getter
@Setter
public class Product {

  /**
   * The title of the product.
   */
  private String title;


  /**
   * The inventories of the product.
   */
  private int productInventories;

}
