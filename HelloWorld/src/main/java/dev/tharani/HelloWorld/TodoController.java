package dev.tharani.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @GetMapping("/get")
    String getTodo(){
        return "Todo";
    }
    @GetMapping("/id")
    String getTodoById(){
        return "Todo with ID";
    }
    //Path Variable
    @GetMapping("/{id}")
    String getTodoWithId(@PathVariable long id){
        return "Todo with ID";
    }

    //RequestParams
    @GetMapping("")
    String getTodoWithIdParam(@RequestParam long id){
        return "Todo with ID";
    }

    //Post Mapping
    @PostMapping("/create")
    String createUser(@RequestBody String body){
        return body;
    }

    //Put Mapping
    @PutMapping("/update/{id}")
    String updateById(@PathVariable long id){
        return "Update by id";
    }

    //Delete Mapping
    @DeleteMapping("/delete/{id}")
    String DeleteById(@PathVariable long id){
        return "Delete by id";
    }
}
