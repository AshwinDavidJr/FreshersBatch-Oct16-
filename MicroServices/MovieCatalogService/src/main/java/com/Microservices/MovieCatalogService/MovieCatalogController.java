package com.Microservices.MovieCatalogService;

import java.util.Collections;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@RequestMapping("/{UserId}")
	public List<CatalogItem> getCatalog(@PathParam("UserId") String UserId) {
		return Collections.singletonList(new CatalogItem("Movie 1", "This is a movie", 8));
	}
}
