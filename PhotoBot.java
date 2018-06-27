import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhotoBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            
            if (message_text.equals("/start")) {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText(message_text);
                try {
                    sendMessage(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("Dafne")) {
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText("Hola Dafnecita preciosita rebonita!!! :*****");
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                
            } else if (message_text.equals("/BTC")) {
            	MiClienteREST miclienterest = new MiClienteREST();
            	float valorbtc = miclienterest.peticionAPIBTC();
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText(String.valueOf(valorbtc));
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("/ETH")) {
            	MiClienteREST miclienterest = new MiClienteREST();
            	float valoreth = miclienterest.peticionAPIETH();
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText(String.valueOf(valoreth));
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("/BCH")) {
            	MiClienteREST miclienterest = new MiClienteREST();
            	float valorbch = miclienterest.peticionAPIBCH();
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText(String.valueOf(valorbch));
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("/LTC")) {
            	MiClienteREST miclienterest = new MiClienteREST();
            	float valorltc = miclienterest.peticionAPILTC();
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText(String.valueOf(valorltc));
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                
                
                
                
            } else if (message_text.equals("friki")) {
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText("No me digas eso que saco a mi guerrero/mago nivel 20 y te apalizo! ;-P");
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("tonto")) {
                SendMessage message = new SendMessage()
                        .setChatId(chat_id)
                        .setText("No me hable así, puede que sea un bot pero tengo mi corazoncito snifff snifff :_(");
                        
                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                
            } else if (message_text.equals("/foto")) {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chat_id)
                        .setPhoto("AgADBAAD76wxG-urYFH7nszJWbIg1iQJkRkABDek_DR5Zcldk_ICAAEC")
                        .setCaption("Photo");
                try {
                    sendPhoto(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("/teclado")) {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText("Aquí tienes tu teclado");
                // Create ReplyKeyboardMarkup object
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                // Create the keyboard (list of keyboard rows)
                List<KeyboardRow> keyboard = new ArrayList<>();
                // Create a keyboard row
                KeyboardRow row = new KeyboardRow();
                // Set each button, you can also use KeyboardButton objects if you need something else than text
                row.add("Foto mía (BrIron Man)");
                row.add("Criptominati");
                row.add("Foto de mi amigo el Capi");
                // Add the first row to the keyboard
                keyboard.add(row);
                // Create another keyboard row
                row = new KeyboardRow();
                // Set each button for the second line
                row.add("letra cancion");
                row.add("Row 2 Button 2");
                row.add("Row 2 Button 3");
                // Add the second row to the keyboard
                keyboard.add(row);
                // Set the keyboard to the markup
                keyboardMarkup.setKeyboard(keyboard);
                // Add it to the message
                message.setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("Foto mía (BrIron Man)")) {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chat_id)
                        .setPhoto("AgADBAAD_KwxG-urYFE269_eXvtlGMtn4xkABO-lqWpMG7bsKQEEAAEC")
                        .setCaption("Mira que guapo que soy :-)");

                try {
                    sendPhoto(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            } else if (message_text.equals("Criptominati")) {
                SendPhoto msg = new SendPhoto()		
                        .setChatId(chat_id)
                        .setPhoto("AgADBAAD_KwxG-urYFE269_eXvtlGMtn4xkABO-lqWpMG7bsKQEEAAEC")
                        .setCaption("Captura de pantalla de Criptominati versión web");
                SendMessage message = new SendMessage()
                		.setChatId(chat_id)
                		.setText("Criptominati es un juego que se encuentra actualmente en desarrollo, Juego de transacciones de criptomonedas por turnos.");
                
                try {
                    sendPhoto(msg); // Call method to send the photo
                    sendMessage(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            } else if (message_text.equals("Foto de mi amigo el Capi")) {
                SendPhoto msg = new SendPhoto()
                        .setChatId(chat_id)
                        .setPhoto("AgADBAADT64xG7oReFEMulohugjw30O3mxoABNXIYzhsqQ4_W4ECAAEC")
                        .setCaption("Mira que guapos salimos el Capi y yo :-D");

                try {
                    sendPhoto(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message_text.equals("letra cancion")) {
            	MiClienteREST micliente = new MiClienteREST();
            	String letracancion = micliente.peticionAPILetra();
            	SendMessage message = new SendMessage()
                		.setChatId(chat_id)
                		.setText(letracancion);

                try {
                    sendMessage(message); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                
            } else if (message_text.equals("/hide")) {
                SendMessage msg = new SendMessage()
                        .setChatId(chat_id)
                        .setText("Keyboard hidden");
                ReplyKeyboardRemove keyboardMarkup = new ReplyKeyboardRemove();
                msg.setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                } 
            } else {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText("Unknown command");
                try {
                    sendMessage(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (update.hasMessage() && update.getMessage().hasPhoto()) {
            // Message contains photo
            // Set variables
            long chat_id = update.getMessage().getChatId();

            List<PhotoSize> photos = update.getMessage().getPhoto();
            String f_id = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getFileId();
            int f_width = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getWidth();
            int f_height = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getHeight();
            String caption = "file_id: " + f_id + "\nwidth: " + Integer.toString(f_width) + "\nheight: " + Integer.toString(f_height);
            SendPhoto msg = new SendPhoto()
                    .setChatId(chat_id)
                    .setPhoto(f_id)
                    .setCaption(caption);
            try {
                sendPhoto(msg); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        return "tunombredebot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "numerosraros:masdatoslargos";
    }
    
}
