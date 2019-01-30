package cordova-plugin-calculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Calculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) 
        {
            this.add(args, callbackContext);    
        } else if(action.equals("substract")) {
            this.add(args, callbackContext);    

        }
        /*if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }*/        
        return false;
    }


        private void add(JSONArray args, CallbackContext callback)
        {
            if(args != null)
            {
                try {
                    int pl1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                    int pl2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                    callback.success(""+ (pl1+pl2));

                } catch (Exception ex) {
                    //TODO: handle exception
                    callback.errors("Something is wrong" + ex);
                }
            }else{
                callback.errors("Value is Null" );
            }
        }

        private void substract(JSONArray args, CallbackContext callback)
        {
            if(args != null)
            {
                try {
                    int pl1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                    int pl2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                    callback.success( "" + (pl1 - pl2));

                } catch (Exception ex) {
                    //TODO: handle exception
                    callback.errors("Something is wrong" + ex);
                }
            }else{
                callback.errors("Value is Null" );
            }
        }
    /*private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }*/

}
