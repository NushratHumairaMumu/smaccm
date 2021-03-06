/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#include "mavlink_manual_setpoint_msg.h"

void mavlink_manual_setpoint_msg_send(const struct manual_setpoint_msg* n_var0,
                                      uint8_t* n_var1, uint8_t n_var2[80U])
{
    uint8_t n_local0[22U] = {};
    uint8_t* n_ref1 = n_local0;
    uint32_t n_deref2 = n_var0->time_boot_ms;
    
    mavlink_pack_uint32_t((uint8_t*) n_ref1, 0U, n_deref2);
    
    float n_deref3 = n_var0->roll;
    
    mavlink_pack_float((uint8_t*) n_ref1, 4U, n_deref3);
    
    float n_deref4 = n_var0->pitch;
    
    mavlink_pack_float((uint8_t*) n_ref1, 8U, n_deref4);
    
    float n_deref5 = n_var0->yaw;
    
    mavlink_pack_float((uint8_t*) n_ref1, 12U, n_deref5);
    
    float n_deref6 = n_var0->thrust;
    
    mavlink_pack_float((uint8_t*) n_ref1, 16U, n_deref6);
    
    uint8_t n_deref7 = n_var0->mode_switch;
    
    mavlink_pack_uint8_t((uint8_t*) n_ref1, 20U, n_deref7);
    
    uint8_t n_deref8 = n_var0->manual_override_switch;
    
    mavlink_pack_uint8_t((uint8_t*) n_ref1, 21U, n_deref8);
    for (int32_t n_ix9 = 0; n_ix9 <= 21; n_ix9++) {
        ASSERTS(n_ix9 > 0 && 2147483647 - n_ix9 >= 6 || n_ix9 <= 0);
        if (n_ix9 + 6 >= 80) { } else {
            uint8_t n_deref10 = n_ref1[n_ix9];
            
            ASSERTS(n_ix9 > 0 && 2147483641 >= n_ix9 || n_ix9 <= 0);
            ASSERTS(0 <= 6 + n_ix9 && 6 + n_ix9 < 80);
            *&n_var2[(6 + n_ix9) % 80] = n_deref10;
        }
    }
    mavlinkSendWithWriter(81U, 106U, 22U, n_var1, n_var2);
    for (int32_t n_ix11 = 0; n_ix11 <= 49; n_ix11++) {
        ASSERTS(n_ix11 > 0 && 2147483647 - n_ix11 >= 30 || n_ix11 <= 0);
        ASSERTS(0 <= n_ix11 + 30 && n_ix11 + 30 < 80);
        *&n_var2[(n_ix11 + 30) % 80] = 0U;
    }
    return;
}

void mavlink_manual_setpoint_unpack(struct manual_setpoint_msg* n_var0, const
                                    uint8_t* n_var1)
{
    uint32_t n_r0 = mavlink_unpack_uint32_t(n_var1, 0U);
    
    *&n_var0->time_boot_ms = n_r0;
    
    float n_r1 = mavlink_unpack_float(n_var1, 4U);
    
    *&n_var0->roll = n_r1;
    
    float n_r2 = mavlink_unpack_float(n_var1, 8U);
    
    *&n_var0->pitch = n_r2;
    
    float n_r3 = mavlink_unpack_float(n_var1, 12U);
    
    *&n_var0->yaw = n_r3;
    
    float n_r4 = mavlink_unpack_float(n_var1, 16U);
    
    *&n_var0->thrust = n_r4;
    
    uint8_t n_r5 = mavlink_unpack_uint8_t(n_var1, 20U);
    
    *&n_var0->mode_switch = n_r5;
    
    uint8_t n_r6 = mavlink_unpack_uint8_t(n_var1, 21U);
    
    *&n_var0->manual_override_switch = n_r6;
}