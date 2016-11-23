package contacts;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class ContactcsController {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/save-contact", method = RequestMethod.POST, produces = "application/json")
    public Contact saveContacts(@RequestBody Contact contact) throws IOException {

        return contact;
//
//        BufferedReader inputStream = new BufferedReader(new InputStreamReader(request.getInputStream()));
//
//        StringBuilder stringBuilder = new StringBuilder();
//        String line;
//
//        while ((line = inputStream.readLine()) != null){
//            stringBuilder.append(line);
//        }
//
//        return stringBuilder.toString();
    }
}



