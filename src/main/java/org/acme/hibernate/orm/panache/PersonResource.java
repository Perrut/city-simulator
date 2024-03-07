package org.acme.hibernate.orm.panache;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/people")
@ApplicationScoped
public class PersonResource {

  @GET
  public Uni<List<Person>> get() {
    return Person.listAll(Sort.by("name"));
  }
}