package controller;

import lombok.Getter;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import services.GuaranaService;


@Getter
@Controller
public class GuaranaController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(GuaranaController.class);
    private final GuaranaService guaranaService;

    public GuaranaController(GuaranaService guaranaService) {
        this.guaranaService = guaranaService;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GuaranaController)) return false;
        final GuaranaController other = (GuaranaController) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$guaranaService = this.getGuaranaService();
        final Object other$guaranaService = other.getGuaranaService();
        if (this$guaranaService == null ? other$guaranaService != null : !this$guaranaService.equals(other$guaranaService))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GuaranaController;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $guaranaService = this.getGuaranaService();
        result = result * PRIME + ($guaranaService == null ? 43 : $guaranaService.hashCode());
        return result;
    }

    public String toString() {
        return "GuaranaController(guaranaService=" + this.getGuaranaService() + ")";
    }
}
