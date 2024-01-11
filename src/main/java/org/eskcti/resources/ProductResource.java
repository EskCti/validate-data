package org.eskcti.resources;

import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eskcti.dto.Product;
import org.eskcti.response.Result;

@Path("/product")
public class ProductResource {
    @POST
    public Result addProduct(@Valid Product product) {
        return new Result("Produto inserido é válido");
    }
}
