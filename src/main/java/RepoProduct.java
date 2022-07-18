public class RepoProduct {
    Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] getAll() {
        return products;
    }

    public Product[] removeId(int id) {
        Product[] result = new Product[products.length - 1];
        int index = 0;

        for (Product product : products) {
            if (product.getId() != id) {
                result[index] = product;
                index++;
            }
        }
        return result;
    }
}
