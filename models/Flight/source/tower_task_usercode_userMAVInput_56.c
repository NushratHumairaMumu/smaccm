/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#include "tower_task_usercode_userMAVInput_56.h"

uint8_t armedRef_63;

struct rc_channels_override_msg over_msg_local_64;

uint16_t channels_65[8U];

struct userinput_result userinput_res_66;

bool jsFailSafe_67;

void eventhandler_userMAVInput_56_chan13_72(const
                                            struct rc_channels_override_msg* n_var0)
{
    read_userMAVInput_56_dataport12_58(&armedRef_63);
    
    uint8_t n_deref0 = *&armedRef_63;
    
    if (n_deref0 == 1U) {
        uint32_t n_r1 = tower_gettimemillis();
        
        if (&over_msg_local_64 != n_var0) {
            memcpy(&over_msg_local_64, n_var0,
                   sizeof(struct rc_channels_override_msg));
        } else {
            ASSERTS(false);
        }
        processOverrideMsg(channels_65, &over_msg_local_64);
        userinput_decode(channels_65, &userinput_res_66, n_r1);
        
        uint16_t n_deref2 = channels_65[4];
        
        *&jsFailSafe_67 = 2000U == n_deref2;
        write_userMAVInput_56_dataport38_62(&jsFailSafe_67);
        write_userMAVInput_56_dataport37_60(&userinput_res_66);
    }
}

void processOverrideMsg(uint16_t n_var0[8U],
                        struct rc_channels_override_msg* n_var1)
{
    uint16_t n_deref0 = n_var1->chan1_raw;
    
    *&n_var0[0] = n_deref0;
    
    uint16_t n_deref1 = n_var1->chan2_raw;
    
    *&n_var0[1] = n_deref1;
    
    uint16_t n_deref2 = n_var1->chan3_raw;
    
    *&n_var0[2] = n_deref2;
    
    uint16_t n_deref3 = n_var1->chan4_raw;
    
    *&n_var0[3] = n_deref3;
    
    uint16_t n_deref4 = n_var1->chan5_raw;
    
    *&n_var0[4] = n_deref4;
    
    uint16_t n_deref5 = n_var1->chan6_raw;
    
    *&n_var0[5] = n_deref5;
    
    uint16_t n_deref6 = n_var1->chan7_raw;
    
    *&n_var0[6] = n_deref6;
    
    uint16_t n_deref7 = n_var1->chan8_raw;
    
    *&n_var0[7] = n_deref7;
}