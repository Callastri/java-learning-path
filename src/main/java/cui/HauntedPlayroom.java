package cui;

public class HauntedPlayroom {
    static void main(String[] args) {
        String[] guests = {"Vampire", "Witch", "Ghost", "Black Cat", "Pumpkin Spirit"};
        System.out.println("🎃 Welcome to the Haunted Playroom! 🎃");
        System.out.println("Tonight’s mysterious guests are gathering...");

        for (String guest : guests) {
            System.out.println("🕯️ " + guest + " enters the room, ready for a night of tricks and treats...");
            spookyPause();
        }

        System.out.println("\n💀 The candles flicker... a secret challenge appears! 💀");
        challenge();
        System.out.println("\nThe night ends with whispers, laughter, and a little bit of magic. 🌙");
    }

    private static void spookyPause() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void challenge() {
        String[] dares = {
                "Share your darkest Halloween secret.",
                "Tell a scary story — in your most dramatic voice.",
                "Do your best monster impression.",
                "Compliment the person to your left... mysteriously.",
                "Summon your inner mischief spirit and make everyone laugh."
        };

        int random = (int) (Math.random() * dares.length);
        System.out.println("🎭 Dare of the Night: " + dares[random]);
    }
}
