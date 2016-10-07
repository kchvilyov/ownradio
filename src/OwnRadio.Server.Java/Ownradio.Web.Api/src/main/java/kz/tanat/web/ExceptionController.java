package kz.tanat.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exception")
public class ExceptionController {
    /**
     * For exception test only!
     * @throws Exception
     */
    @RequestMapping(value = "*", method = RequestMethod.GET)
    public ResponseEntity<?> getException() throws Exception {
        throw (new Exception("Test exception"));
    }

    /**
     * For exception test only!
     * @throws RuntimeException
     */
    @RequestMapping(value = "/runtime", method = RequestMethod.GET)
    public ResponseEntity<?> getRuntimeException() throws RuntimeException {
        throw (new RuntimeException("Test runtime exception"));
    }

    /**
     * For exception test only!
     * @throws RuntimeException
     */
    @RequestMapping(value = "/throwable", method = RequestMethod.GET)
    public ResponseEntity<?> getThrowable() throws Throwable {
        throw (new Throwable("Test throwable"));
    }
}
